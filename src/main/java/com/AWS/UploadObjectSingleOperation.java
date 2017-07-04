package com.AWS;

import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class UploadObjectSingleOperation {
	private static String bucketName     = "apaultest123";
	private static String keyName        = "irisData";//its going to saved by this name inside the bucket
	private static String uploadFileName = "/home/vishal/Downloads/IRIS.csv";
	
	public void UploadFile() {
        AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());//it will take the credentials from aws configure 
        try {
            File file = new File(uploadFileName);
            s3client.putObject(new PutObjectRequest(bucketName, keyName, file));

         } catch (AmazonServiceException ase) {
            System.out.println(ase.getErrorCode() );
        } catch (AmazonClientException ace) {
            System.out.println(ace.getMessage());
        }
    }
}