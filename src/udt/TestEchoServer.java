package udt;

public class TestEchoServer {
	public static void main(String[] args) throws Exception {
		EchoServer es=new EchoServer(65321);
		es.start();
	}
}