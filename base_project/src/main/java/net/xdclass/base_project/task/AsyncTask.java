package net.xdclass.base_project.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
@Async
public class AsyncTask {
	
	
	public void task1() {
		long begin = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("task 1 : " + (end - begin));
	}
	public void task2() {
		long begin = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("task 2 : " + (end - begin));
		
	}
	public void task3() {
		long begin = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("task 3 : " + (end - begin));
	}
	
	public Future<String> task4() {
		long begin = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("task 4 : " + (end - begin));
		return new AsyncResult<String>("task 4");
	}
	
	public Future<String> task5() {
		long begin = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("task 5 : " + (end - begin));
		return new AsyncResult<String>("task 5");
	}
}
