package com.nativelibs4java.opencl.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_short4 extends com.ochafik.lang.jnaerator.runtime.Union<cl_short4, cl_short4.ByValue, cl_short4.ByReference> {
	/// C type : cl_short[4]
	public short[] i16 = new short[(4)];
	public cl_short4() {
		super();
	}
	/// @param i16 C type : cl_short[4]
	public cl_short4(short i16[]) {
		super();
		if (i16.length != this.i16.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.i16 = i16;
		setType(short[].class);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_short4 newInstance() { return new cl_short4(); }
	public static cl_short4[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Union.newArray(cl_short4.class, arrayLength);
	}
	public static class ByReference extends cl_short4 implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends cl_short4 implements com.sun.jna.Structure.ByValue {}
}
