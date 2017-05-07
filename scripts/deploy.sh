#!/usr/bin/env bash

if [ -z "${AWS_ACCESS_KEY_ID:-}" -o -z "${AWS_SECRET_ACCESS_KEY:-}" ]; then
    printf "\nUnable to locate credentials. You can configure credentials by running \"aws configure\".\n\n"
    exit 1
fi

printf "\nUpdating Lambda Function Code\n"
aws --region "us-east-1" lambda update-function-code --function-name aws-lambda-template-function --zip-file fileb://build/distributions/aws-lambda-template-1.0-SNAPSHOT.zip

printf "\nPublishing Version\n"
aws --region "us-east-1" lambda publish-version --function-name aws-lambda-template-function --description "Just a function."

printf "\Done!\n"

