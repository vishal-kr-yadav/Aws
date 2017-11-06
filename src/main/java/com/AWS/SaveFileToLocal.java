package com.AWS;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class SaveFileToLocal {
	public void readS3ObjectUsingByteArray(String bucketName, String key, String outputFileName) throws IOException {
		AmazonS3 s3=new AmazonS3Client(new ProfileCredentialsProvider());//it will take all the credentials from the ws configure 
int BUFFER_SIZE=50;
		S3Object s3object = s3.getObject(new GetObjectRequest(
	            bucketName, key));

	    InputStream stream = s3object.getObjectContent();
	    byte[] content = new byte[BUFFER_SIZE];

	    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFileName));
	    int totalSize = 0;
	    int bytesRead;
	    while ((bytesRead = stream.read(content)) != -1) {
	      System.out.println(String.format("%d bytes read from stream", bytesRead));
	      outputStream.write(content, 0, bytesRead);
	      totalSize += bytesRead;
	    }
	    System.out.println("Total Size of file in bytes = "+totalSize);
	    // close resource even during exception
	    outputStream.close();
	  }


}
