package donguyennhathan.com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class BaiTapHashMap {

	static HashMap<String, String> dsSV= new HashMap<String, String>();
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

	static void menu()
	{
		System.out.println("Phần mềm quản lý sinh viên:");
		System.out.println("1. Thêm SV");
		System.out.println("2. Xuất SV");
		System.out.println("3. Sửa SV");
		System.out.println("4. Xóa SV");
		System.out.println("5. Tìm SV");
		System.out.println("6. Xuất mã SV");
		System.out.println("7. Xuất tên SV");
		System.out.println("8. Thoát");
		System.out.println("Mời bạn chọn chức năng:");
		int kq= new Scanner(System.in).nextInt();
		switch(kq)
		{
		case 1:
			themSV();
			break;
		case 2:
			XuatSV();
			break;
		case 3:
			SuaSV();
			break;
		case 4: 
			XoaSV();
			break;
		case 5:
			TimSV();
			break;
		case 6:
			XuatMaSV();
			break;
		case 7:
			XuatTenSV();
			break;
		case 8:
			System.out.println("Tạm biệt");
			System.exit(0); // Thoát ngang phần mềm
		}
	}

	private static void XuatTenSV() {
		System.out.println("Danh sách tên SV");
		System.out.println("-------------------------------");
		Collection<String> value= dsSV.values();
		Object[] dsValue= value.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println(dsValue[i]);
		}
		System.out.println("-------------------------------");
	}

	private static void XuatMaSV() {
		System.out.println("Danh sách mssv");
		System.out.println("-------------------------------");
		Collection<String> key= dsSV.keySet();
		Object[] dsKey= key.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println(dsKey[i]);
		}
		System.out.println("-------------------------------");
	}

	static HashMap<String, String> dsSvCanTim= new HashMap<String, String>();
	private static void TimSV() {
		String tenSvCanTim= "An";
		Collection<String> value= dsSV.values();
		Collection<String> key= dsSV.keySet();
		Object[] dsValue= value.toArray();
		Object[] dsKey= key.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			if(dsValue[i].toString().endsWith("An"))
			{
				dsSvCanTim.put(dsKey[i].toString(), dsValue[i].toString());
			}
		}
		System.out.println("Danh sách sinh viên cần tìm:");
		System.out.println("-------------------------------");
		System.out.println("Mã SV\tTên SV");
		Collection<String> value1= dsSvCanTim.values();
		Collection<String> key1= dsSvCanTim.keySet();
		Object[] dsValue1= value1.toArray();
		Object[] dsKey1= key1.toArray();
		for(int i=0; i<dsSvCanTim.size();i++)
		{
			System.out.println(dsKey1[i]+"\t"+dsValue1[i]);
		}
		System.out.println("-------------------------------");
		dsSvCanTim.clear();
	}

	private static void XoaSV() {
		XuatSV();
		System.out.println("Nhập tên sv bạn muốn xóa");
		String tenSvCanXoa= new Scanner(System.in).nextLine();
		Collection<String> value= dsSV.values();
		Collection<String> key= dsSV.keySet();
		Object[] dsValue= value.toArray();
		Object[] dsKey= key.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			if(dsValue[i].toString().compareTo(tenSvCanXoa)==0)
			{
				dsSV.remove(dsKey[i]);
				System.out.println("Xóa thành công");
			}
		}
	}

	private static void SuaSV() {
		XuatSV();
		System.out.println("Chọn MSSV và sửa tên SV");
		System.out.println("Nhập mssv: ");
		String maSV= new Scanner(System.in).nextLine();
		System.out.println("Nhập tên sv: ");
		String tenSV= new Scanner(System.in).nextLine();
		dsSV.put(maSV, tenSV);
		System.out.println("Danh sách sinh viên sau khi sửa:");
		System.out.println("-------------------------------");
		System.out.println("Mã SV\tTên SV");
		Collection<String> value= dsSV.values();
		Collection<String> key= dsSV.keySet();
		Object[] dsValue= value.toArray();
		Object[] dsKey= key.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println(dsKey[i]+"\t"+dsValue[i]);
		}
		System.out.println("-------------------------------");
	}

	private static void XuatSV() {
		System.out.println("Danh sách sinh viên:");
		System.out.println("-------------------------------");
		System.out.println("Mã SV\tTên SV");
		Collection<String> value= dsSV.values();
		Collection<String> key= dsSV.keySet();
		Object[] dsValue= value.toArray();
		Object[] dsKey= key.toArray();
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println(dsKey[i]+"\t"+dsValue[i]);
		}
		System.out.println("-------------------------------");
	}

	private static void themSV() {
		String tiepTuc="c";
		while(true)
		{
			if(tiepTuc.compareTo("c")==0)
			{
				System.out.println("Mời bạn nhập mã sv (nhấn 0 để thoát): ");
				String maSV= new Scanner(System.in).nextLine();
				System.out.println("Mời bạn nhập tên sv: ");
				String tenSV= new Scanner(System.in).nextLine();
				dsSV.put(maSV, tenSV);
			}
			else
			{
				break;
			}
			System.out.println("Bạn có muốn nhập tiếp ko (c/k):");
			tiepTuc= new Scanner(System.in).nextLine();
		}
	}
}
