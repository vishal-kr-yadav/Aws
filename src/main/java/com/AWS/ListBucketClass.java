package com.AWS;

import java.util.List;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

public class ListBucketClass {

	public List<Bucket> listBucketMethod()
	{
		AmazonS3 s3=new AmazonS3Client(new ProfileCredentialsProvider());
		List<Bucket> s=s3.listBuckets();
		return s;
	}
}
