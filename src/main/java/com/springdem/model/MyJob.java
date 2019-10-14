package com.springdem.model;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO 自动生成的方法存根
       System.out.println("quartz的具体每次执行的任务！");
	}

}
