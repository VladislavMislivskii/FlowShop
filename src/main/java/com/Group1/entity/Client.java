package com.Group1.entity;

import javax.persistence.*; //Связь с БД (ORM)

@Entity //Сущность
@Table(name = "Client")
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Автомат
        @Column(name = "ID")
        private Long id;

        @Column(name = "FNAME")
        private String fname;

        @Column(name = "LNAME")
        private String lname;

        @Column(name = "PNAME")
        private String pname;

        @Column(name = "EMAIL")
        private String email;

        @Column(name = "PHONE")
        private String phone;

        @Column(name = "PASSWORD")
        private String password;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFname() {
                return fname;
        }

        public void setFname(String fname) {
                this.fname = fname;
        }

        public String getLname() {
                return lname;
        }

        public void setLname(String lname) {
                this.lname = lname;
        }

        public String getPname() {
                return pname;
        }

        public void setPname(String pname) {
                this.pname = pname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        @Override
        public String toString() {
                return "Client{" +
                        "id=" + id +
                        ", FName='" + fname + '\'' +
                        ", LName='" + lname + '\'' +
                        ", PName='" + pname + '\'' +
                        ", Email='" + email + '\'' +
                        ", Phone='" + phone + '\'' +
                        ", Password='" + password + '\'' +
                        '}';
        }
}
