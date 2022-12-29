class NewThread extends Thread
{
 	String name,msg;
	int st;
	NewThread(String n,String m,int ti)
	{
		name=n;
		msg=m;
		st=ti;
		Thread t=new Thread(this,name);
		System.out.println(name+":"+t);
		t.start();
	}
	public void run()
	{
		int i;
		try
		{
			for(;;)
			{
				System.out.println(msg);
				Thread.sleep(st);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name+": interrupted");
		}
		System.out.println(name+":exit");
	}
}
class MultipleThreadcreation_message
{
	public static void main(String args[])
	{
		new NewThread("first","Good morning",1000);
		new NewThread("second","hello",2000);
		new NewThread("third","welcome",3000);
	}
}
