package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TextInput {

	public static void main(String[] args) {
		String line1 = "ijjiqs jubub fuebfuebqs";
		String line2 = "ijjiqs jubub fueqs bfuebqs";
		int count = 0;
		//countWords(line1,"qs",count);
		//count = countWords(line2,"qs",count);
		System.out.println(count);

	}
	
	private void processLines(InputStream inputStream) throws IOException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		while(reader.ready()) {
			 String line = reader.readLine();
			 int count = 0;
			 service.execute(new Worker(line, count));	    
		}
	}

}

class Worker implements Runnable {
	  private final String line;
	  private int count;
	  public Worker(String line, int count) {
	    this.line = line;
	    this.count = count;
	  }
	  @Override
	  public void run() {
		  count += countCharSeq(line, "qs", count);
	  }
	  private int countCharSeq(String line, String seq, int count) {
			count += line.split(seq, -1).length - 1;
			return count;
	}
}
