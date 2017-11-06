package com.AWS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class ReadFileContent{
	

public void readFromS3(String bucketName, String key) throws IOException {
	AmazonS3 s3=new AmazonS3Client(new ProfileCredentialsProvider());

    S3Object s3object = s3.getObject(new GetObjectRequest(
            bucketName, key));
    System.out.println("getContentType=="+s3object.getObjectMetadata().getContentType());
    System.out.println("getLength=="+s3object.getObjectMetadata().getContentLength());

    BufferedReader reader = new BufferedReader(new InputStreamReader(s3object.getObjectContent()));
    String line;
    while((line = reader.readLine()) != null) {
      // can copy the content locally as well
      // using a buffered writer
      System.out.println(line);
    }
  }
}