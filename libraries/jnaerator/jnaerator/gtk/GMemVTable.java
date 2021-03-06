package gtk;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.cpp.CPPObject;
/**
 * Memory allocation virtualization for debugging purposes<br>
 * g_mem_set_vtable() has to be the very first GLib function called<br>
 * if being used<br>
 * <i>native declaration : glib-2.0/glib/gmem.h:240</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public class GMemVTable extends CPPObject {
	static {
		BridJ.register();
	}
	/** C type : free_callback* */
	@Field(0) 
	public Pointer<GMemVTable.free_callback > free() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : free_callback* */
	@Field(0) 
	public GMemVTable free(Pointer<GMemVTable.free_callback > free) {
		this.io.setPointerField(this, 0, free);
		return this;
	}
	/**
	 * optional; set to NULL if not used !<br>
	 * C type : calloc_callback*
	 */
	@Field(1) 
	public Pointer<GMemVTable.calloc_callback > calloc() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * optional; set to NULL if not used !<br>
	 * C type : calloc_callback*
	 */
	@Field(1) 
	public GMemVTable calloc(Pointer<GMemVTable.calloc_callback > calloc) {
		this.io.setPointerField(this, 1, calloc);
		return this;
	}
	/** C type : try_malloc_callback* */
	@Field(2) 
	public Pointer<GMemVTable.try_malloc_callback > try_malloc() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : try_malloc_callback* */
	@Field(2) 
	public GMemVTable try_malloc(Pointer<GMemVTable.try_malloc_callback > try_malloc) {
		this.io.setPointerField(this, 2, try_malloc);
		return this;
	}
	/** C type : try_realloc_callback* */
	@Field(3) 
	public Pointer<GMemVTable.try_realloc_callback > try_realloc() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : try_realloc_callback* */
	@Field(3) 
	public GMemVTable try_realloc(Pointer<GMemVTable.try_realloc_callback > try_realloc) {
		this.io.setPointerField(this, 3, try_realloc);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class gpointer_callback extends Callback<gpointer_callback > {
		public abstract void apply(@CLong long n_bytes);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class gpointer_callback2 extends Callback<gpointer_callback2 > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer_callback(gpointer mem, gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer_callback(gpointer mem, gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class free_callback extends Callback<free_callback > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * void free_callback(gpointer mem);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * void free_callback(gpointer mem);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class calloc_callback extends Callback<calloc_callback > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer calloc_callback(gsize n_blocks, gsize n_block_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer calloc_callback(gsize n_blocks, gsize n_block_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class try_malloc_callback extends Callback<try_malloc_callback > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer try_malloc_callback(gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer try_malloc_callback(gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class try_realloc_callback extends Callback<try_realloc_callback > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer try_realloc_callback(gpointer mem, gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/glib/gmem.h</i><br>
		 * gpointer try_realloc_callback(gpointer mem, gsize n_bytes);<br>
		 * Conversion Error : gpointer (Unsupported type)
		 */
	};
	public GMemVTable() {
		super();
	}
	public GMemVTable(Pointer pointer) {
		super(pointer);
	}
}
