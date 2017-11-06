package com.AWS;
import com.amazonaws.services.cloudwatch.AmazonCloudWatch;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder;
import com.amazonaws.services.cloudwatch.model.ListMetricsRequest;
import com.amazonaws.services.cloudwatch.model.ListMetricsResult;
import com.amazonaws.services.cloudwatch.model.Metric;

class Logs {
	public void retrieveLogs() {
	final AmazonCloudWatch cw = AmazonCloudWatchClientBuilder.defaultClient();
boolean done=false;
		while(!done) {
		    ListMetricsRequest request = new ListMetricsRequest()
		        .withMetricName("name")
		        .withNamespace("namespace");

		    ListMetricsResult response = cw.listMetrics(request);

		    for(Metric metric : response.getMetrics()) {
		        System.out.printf(
		            "Retrieved metric %s", metric.getMetricName());
		    }

		    request.setNextToken(response.getNextToken());

		    if(response.getNextToken() == null) {
		        done = true;
		    }
		}
	}

}
public class CloudwatchLogs{
	public static void main(String args[])
	{
		Logs l=new Logs();
		l.retrieveLogs();
	}
}

