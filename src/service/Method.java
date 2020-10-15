package service;

import model.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class Method {
    static public List<Phonebook> phonebooks = new ArrayList<>();

//    static {
//        phonebooks.add(new Phonebook("quan", "0913243623", "ha noi", "ban be", "nam", "quan.nv@gmail.com", "23/5/2001"));
//        phonebooks.add(new Phonebook("ngoc anh", "0913243643", "ha noi", "ban be", "nu", "ngocanh.nv@gmail.com", "24/7/2001"));
//
//    }

    public void add(Phonebook phonebook) {
        boolean isHas = true;
        for (int i = 0; i < phonebooks.size(); i++) {
            if (phonebooks.get(i).getPhoneNumber().equals(phonebook.getPhoneNumber())) {
                isHas = false;
                break;
            }

        }
        if (isHas) {
            phonebooks.add(phonebook);
        }
    }

    public void deleteByName(String name) {
        for (Phonebook a : phonebooks) {
            if (name.equals(a.getName())) {
                phonebooks.remove(a);
                break;
            }
        }
    }

    public void deleteByPhoneNumber(String phoneNumber) {
        for (Phonebook a : phonebooks) {
            if (phoneNumber.equals(a.getPhoneNumber())) {
                phonebooks.remove(a);
                break;
            }
        }
    }

    public ArrayList<Phonebook> seachByName(String name) {
        ArrayList<Phonebook> arrayList = null;
        for (Phonebook a : phonebooks) {
            if (a.getName().equals(name)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public Phonebook seachByPhoneNumber(String phoneNumber) {
        Phonebook phonebook = null;
        for (Phonebook a : phonebooks) {
            if (a.getPhoneNumber().equals(phoneNumber)) {
                return a;
            }
        }
        return phonebook;
    }

    public void repairByPhoneNumber(String phoneNumber, String name, String address, String type, String gender, String email, String birthday) {

    }

    public void disPlay(ArrayList<Phonebook> phonebooks) {
        for (Phonebook a : phonebooks) {
            System.out.println(a);
        }
    }


}

