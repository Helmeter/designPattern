package chainofResponsibility;

/**
 * Created by helmeter on 5/4/16.
 */
public class VP extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 3;
	}

	@Override
	protected Response echo(Request request) {
		System.out.println("员工的请求level是：" 
				+ request.getRequestLevel());
		System.out.println("副总的答复是：同意");
		return new Response();
	}

}
