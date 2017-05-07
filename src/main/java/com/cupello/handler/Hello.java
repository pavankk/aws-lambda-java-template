package com.cupello.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.cupello.json.GreetingMessage;
import com.cupello.json.User;

public class Hello implements RequestHandler<User, GreetingMessage> {

    @Override
    public GreetingMessage handleRequest(User user, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("AwsRequestId: " + context.getAwsRequestId());
        logger.log("Function name: " + context.getFunctionName());
        logger.log("Max mem allocated: " + context.getMemoryLimitInMB());
        logger.log("Time remaining in milliseconds: " + context.getRemainingTimeInMillis());
        logger.log("CloudWatch log stream name: " + context.getLogStreamName());
        logger.log("CloudWatch log group name: " + context.getLogGroupName());

        String greetingMessage = String.format("Wow! Hello %s!", user.getName());
        return new GreetingMessage(greetingMessage);
    }
}
