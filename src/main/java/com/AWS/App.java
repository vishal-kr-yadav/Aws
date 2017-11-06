package com.AWS;

import java.io.IOException;
import java.util.List;

import com.amazonaws.services.s3.model.Bucket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	//create bucket in s3
    UploadObjectSingleOperation upload=new UploadObjectSingleOperation();
    //UploadObjectSingleOperation
     upload.UploadFile();
    // CreateBucketClass cb=new CreateBucketClass();
    // cb.createbucketmethod();
 
    
    System.out.print("hgghvghvbhj");
    
   
    	//list all bucket of s3
    /* ListBucketClass lb=new ListBucketClass();
    	List<Bucket> s=lb.listBucketMethod();
    	System.out.println(s);
    */
 
    	//reading a file from s3
//      String file ="freedompop/change_log/20121010_12.json";
//    	String bucket="fpconversion";
//    	ReadFileContent rfc=new ReadFileContent();
//    	try {
//			rfc.readFromS3(bucket,file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
    	
    	//saveFile to local system
    /*  String file ="freedompop/change_log/20121010_12.json";
    	String bucket="fpconversion";
    	String localPath="/home/vishal/Documents/test";
    	SaveFileToLocal sftl=new SaveFileToLocal();
    	try {
    			sftl.readS3ObjectUsingByteArray(bucket,file,localPath);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    				e.printStackTrace();
    								} 
    */
    }
}
