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
	private static String bucketName     = "fpconversion/freedompop/reco_data";
	private static String keyName        = "RecoStore_4155d00e-b272-415b-a60b-f7efd4a6cd92_09112017.txt";//its going to saved by this name inside the bucket
	private static String uploadFileName = "/home/vishal/Downloads/RecoStore_4155d00e-b272-415b-a60b-f7efd4a6cd92_09112017.txt";
	
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