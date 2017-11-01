package com.AWS;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CreateBucketRequest;

public class CreateBucketClass
{
	public void createbucketmethod(){
AmazonS3 s3=new AmazonS3Client(new ProfileCredentialsProvider());//it will take all the credentials from the ws configure 
	try{
		String bucketName="apaultest1234";
		s3.createBucket(bucketName);
	}
	catch(AmazonServiceException e)
	{
		System.out.println(e.getErrorMessage());
	
	}
	}
}