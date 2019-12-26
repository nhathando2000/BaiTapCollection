package donguyennhathan.com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BaiTapArrayList {

	static ArrayList<String> dsSV= new ArrayList<String>();
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
		System.out.println("6. Sắp xếp SV");
		System.out.println("7. Thoát");
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
			SapXepSV();
			break;
		case 7:
			System.out.println("Tạm biệt");
			System.exit(0); // Thoát ngang phần mềm
		}
	}
	private static void SapXepSV() {
		Collections.sort(dsSV);
		XuatSV();
	}
	static ArrayList<String> dsSvCanTim= new ArrayList<String>();
	private static void TimSV() {
		System.out.println("Nhập tên SV bạn muốn tìm");
		String tenCanTim= new Scanner(System.in).nextLine();
		for(int i=0; i<dsSV.size();i++)
		{
			if(dsSV.get(i).contains(tenCanTim))
			{
				dsSvCanTim.add(dsSV.get(i));
			}
		}
		if(dsSvCanTim.size()!=0)
		{
			System.out.println("Danh sách sinh viên cần tìm:");
			System.out.println("----------------------------");
			System.out.println("STT\tTên SV");
			for(int i=0; i<dsSvCanTim.size();i++)
			{
				System.out.println((i+1)+"\t"+dsSvCanTim.get(i));
			}
			System.out.println("----------------------------");
			dsSvCanTim.clear();
		}
		else
			System.out.println("Không tìm thấy");
		System.out.println("----------------------------");
	}
	private static void XoaSV() {
		System.out.println("Danh sách SV ban đầu:");
		System.out.println("----------------------------");
		System.out.println("STT\tTên SV");
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println((i+1)+"\t"+dsSV.get(i));
		}
		System.out.println("----------------------------");
		System.out.println("Chọn STT SV mà bạn muốn xóa");
		int stt= new Scanner(System.in).nextInt();
		for(int i=0; i<dsSV.size();i++)
		{
			if(i==stt-1)
			{
				dsSV.remove(i);
			}
		}
		System.out.println("Danh sách SV sau khi xóa SV:");
		System.out.println("----------------------------");
		System.out.println("STT\tTên SV");
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println((i+1)+"\t"+dsSV.get(i));
		}
		System.out.println("----------------------------");
	}
	private static void SuaSV() {
		System.out.println("Danh sách SV ban đầu:");
		System.out.println("----------------------------");
		System.out.println("STT\tTên SV");
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println((i+1)+"\t"+dsSV.get(i));
		}
		System.out.println("----------------------------");
		System.out.println("Chọn STT SV mà bạn muốn sửa");
		int stt= new Scanner(System.in).nextInt();
		System.out.println("Sửa tên SV thành:");
		String tenSua= new Scanner(System.in).nextLine();
		for(int i=0; i<dsSV.size();i++)
		{
			if(i==stt-1)
			{
				dsSV.set(i, tenSua);
			}
		}
		System.out.println("Danh sách SV sau khi sửa:");
		System.out.println("----------------------------");
		System.out.println("STT\tTên SV");
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println((i+1)+"\t"+dsSV.get(i));
		}
		System.out.println("----------------------------");
	}
	private static void XuatSV() {
		System.out.println("Danh sách sinh viên:");
		System.out.println("----------------------------");
		System.out.println("STT\tTên SV");
		for(int i=0; i<dsSV.size();i++)
		{
			System.out.println((i+1)+"\t"+dsSV.get(i));
		}
		System.out.println("----------------------------");
	}
	private static void themSV() {
		String tenSv;
		String thoat="0";
		while(true)
		{
			System.out.println("Mời bạn nhập tên SV (nhấn 0 để thoát): ");
			tenSv= new Scanner(System.in).nextLine();
			if(tenSv.contains(thoat))
			{
				break;
			}
			else
			{
				dsSV.add(tenSv);
			}
		}
	}
}
