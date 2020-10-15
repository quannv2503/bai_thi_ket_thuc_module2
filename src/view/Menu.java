package view;

import IO.IOFile;
import model.Phonebook;
import service.Method;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        IOFile ioFile = new IOFile();
        Method method = new Method();
        ArrayList<Phonebook> phonebooks = (ArrayList<Phonebook>) Method.phonebooks;
        Scanner scanner = new Scanner(System.in);
        String choice = "0";
        do {
            try {
                System.out.println("1.Hiển thị");
                System.out.println("2.Thêm");
                System.out.println("3.Xoá theo SĐT");
                System.out.println("4.Xoá theo tên");
                System.out.println("5.Tìm kiếm theo SĐT");
                System.out.println("6.Tìm kiếm theo tên");
                System.out.println("7.Sửa thong tin");
                System.out.println("8.Ghi file");
                System.out.println("9.Đọc file");
                System.out.println("0.Thoát");
                System.out.print("Bạn nhập:");
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        method.disPlay(phonebooks);
                        break;
                    case "2":
                        System.out.println("Nhập tên:");
                        String name = scanner.nextLine();
                        System.out.println("Nhập SĐT");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Nhập địa chỉ");
                        String address = scanner.nextLine();
                        System.out.println("Nhập nhóm danh bạ");
                        String type = scanner.nextLine();
                        System.out.println("Nhập giới tính");
                        String gender = scanner.nextLine();
                        System.out.println("Nhập email");
                        String email = scanner.nextLine();
                        System.out.println("Nhập ngày sinh");
                        String birthday = scanner.nextLine();
                        method.add(new Phonebook(name, phoneNumber, address, type, gender, email, birthday));
                        break;
                    case "3":
                        System.out.print("Nhap SĐT để xoá:");
                        String phoneNumberDelete = scanner.nextLine();
                        method.deleteByPhoneNumber(phoneNumberDelete);
                        break;
                    case "4":
                        System.out.print("Nhập tên để xoá:");
                        String nameDelete = scanner.nextLine();
                        method.deleteByName(nameDelete);
                        break;
                    case "5":
                        System.out.println("Nhập SĐT người bạn muốn tìm");
                        String phoneNumberSeach = scanner.nextLine();
                        System.out.println(method.seachByPhoneNumber(phoneNumberSeach));
                        break;
                    case "6":
                        System.out.println("Nhập tên người bạn muốn tìm");
                        String nameSeach = scanner.nextLine();
                        method.disPlay(method.seachByName(nameSeach));
                        break;
                    case "7":
                        break;
                    case "8":
                        ioFile.writeFile(phonebooks);
                        System.out.println("Đã ghi");
                        break;
                    case "9":
                        ArrayList<Phonebook> phonebookArrayList = ioFile.readFromFile();
                        Method.phonebooks.clear();
                        for (Phonebook a : phonebookArrayList) {
                            Method.phonebooks.add(a);
                        }
                        System.out.println("Đã đọc");
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("lỗi");
                }
            } catch (Exception e) {
                System.out.println("lỗi");
                choice = "l";
            }
        } while (!choice.equals("0"));
    }
}
