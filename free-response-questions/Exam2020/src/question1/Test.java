package question1;

public class Test {

	public static void main(String[] args) {
		Gizmo gizmo1=new Gizmo("ABC",true,1);
		Gizmo gizmo2=new Gizmo("ABC",false,2);
		Gizmo gizmo3=new Gizmo("XYZ",true,3);
		Gizmo gizmo4=new Gizmo("lmnop",false,4);
		Gizmo gizmo5=new Gizmo("ABC",true,5);
		Gizmo gizmo6=new Gizmo("ABC",false,6);
		
		OnlinePurchaseManager opm=new OnlinePurchaseManager();
		opm.getPurchases().add(gizmo1);
		opm.getPurchases().add(gizmo2);
		opm.getPurchases().add(gizmo3);
		opm.getPurchases().add(gizmo4);
		opm.getPurchases().add(gizmo5);
		opm.getPurchases().add(gizmo6);
		System.out.println(opm.countElectronicsByMaker("ABC"));
		System.out.println(opm.countElectronicsByMaker("lmnop"));
		System.out.println(opm.countElectronicsByMaker("XYZ"));
		System.out.println(opm.countElectronicsByMaker("QRP"));
		System.out.println(opm.hasAdjacentEqualPair());
	}

}
