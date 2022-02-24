# audio-mircorservice
Spring Project for After the Tone Wedding Phone to upload audio files to cloud s3 bucket as a backup

## Final Desired Result
Audio files are able to be sent to microservice to be put into s3 backend on aws

## Current State
Basic spring boot program created from initializer with controller and resources created. 

## TODO:
-  Create file stream upload in audioController class
-  Create error handling for too long of uploads and other unknowns
-  Impelement AWS s3 handling and backend db

## Current Hardware used to send data
-  Raspberry Pi Zero W on Raspbian OS Lite
-  MicroSD card large enough for operating system + wav files created from guests
-  Amazon Maono USB microphone (implanted into phone)
-  Amazon USB/wireless speaker (implanted into phone)
