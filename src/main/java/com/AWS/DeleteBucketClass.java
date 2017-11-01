package com.AWS;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

public class DeleteBucketClass {
	public void deleteBucketMethod(){
		AmazonS3 s3= new AmazonS3Client(new ProfileCredentialsProvider());
		String bucketName="apaultest1234";
		try{
		s3.deleteBucket(bucketName);
		}
		catch(AmazonServiceException ase)
		{
			System.out.println(ase.getErrorCode());
		}
		
		
	}

}
