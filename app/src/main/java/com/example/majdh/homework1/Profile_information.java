package com.example.majdh.homework1;

public class Profile_information
{
    private String first_name;
    private String last_name;
    private String personal_phone_number;
    private String work_phone_number;
    private String personal_email;
    private String work_email;
    private int image;
    private int likes;

    public Profile_information(String fn, String ln, String ppn, String wpn, String pe, String we, int i)
    {
        this.first_name = fn;
        this.last_name = ln;
        this.personal_phone_number = ppn;
        this.work_phone_number = wpn;
        this.personal_email = pe;
        this.work_email = we;
        this.image = i;
        this.likes = 0;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public String getPersonal_email()
    {
        return personal_email;
    }

    public String getPersonal_phone_number()
    {
        return personal_phone_number;
    }

    public String getWork_email() {
        return work_email;
    }

    public String getWork_phone_number()
    {
        return work_phone_number;
    }

    public int getImage() { return image; }

    public int getLikes() { return likes; }

    public void increment_likes()
    {
        likes++;
    }
}
