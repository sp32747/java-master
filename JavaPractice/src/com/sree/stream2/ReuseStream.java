package com.sree.stream2;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
	
//	how to perform terminal operations on a Stream multiple times, while avoiding the famous IllegalStateException 
	//that is thrown when the Stream is already closed or operated upon.

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("A", "B", "C", "D");
		Optional<String> result1 = stringStream.findAny();
		System.out.println(result1.get());

		// After the #findAny() method is invoked, the stringStream is closed,
		// therefore, any further operation on the Stream will throw the
		// IllegalStateException, and that’s what happened after invoking the
		
		// #findFirst() method.

		// Optional<String> result2 = stringStream.findFirst();

		// Simply put, the solution consists of creating a new Stream each time we need
		// one.

		//We can, of course, do that manually, but that’s where the Supplier functional interface becomes really handy:
	
		Supplier<Stream<String>> streamSupplier  = () -> Stream.of("A", "B", "C", "D");
		  
		  
		Stream<String> streamObj1 = streamSupplier.get();
		
		System.out.println("streamObj1 hash code "+streamObj1.hashCode());
		Stream<String> streamObj2 = streamSupplier.get();
		System.out.println("streamObj2 hash code "+streamObj2.hashCode());
		
		
		  
		Optional<String> result11 = streamSupplier.get().findAny();
		System.out.println(result11.get());
		Optional<String> result2 = streamSupplier.get().findFirst();
		System.out.println(result2.get());
	
	
	}

}
