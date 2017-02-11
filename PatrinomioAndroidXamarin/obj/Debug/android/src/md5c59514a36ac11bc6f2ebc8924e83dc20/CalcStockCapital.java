package md5c59514a36ac11bc6f2ebc8924e83dc20;


public class CalcStockCapital
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("PatrinomioAndroidXamarin.CalcStockCapital, PatrinomioAndroidXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CalcStockCapital.class, __md_methods);
	}


	public CalcStockCapital () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CalcStockCapital.class)
			mono.android.TypeManager.Activate ("PatrinomioAndroidXamarin.CalcStockCapital, PatrinomioAndroidXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
