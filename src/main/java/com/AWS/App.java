package com.AWS;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
  /* UploadObjectSingleOperation upload=new UploadObjectSingleOperation();
    upload.UploadFile();
    
    CreateBucketClass cb=new CreateBucketClass();
    cb.createbucketmethod();
    
   DeleteBucketClass db=new DeleteBucketClass();
   db.deleteBucketMethod();*/
    	ListBucketClass lb=new ListBucketClass();
    	List<Bucket> s=lb.listBucketMethod();
    	System.out.println(s);
    }
}
