package com.Group1.entity;

import javax.persistence.*; //Связь с БД (ORM)

@Entity //Сущность
@Table(name = "Client")
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Автомат
        @Column(name = "ID")
        private Long id;

        @Column(name = "FName")
        private String FName;

        @Column(name = "LName")
        private String LName;

        @Column(name = "PName")
        private String PName;

        @Column(name = "Email")
        private String Email;

        @Column(name = "Phone")
        private String Phone;

        @Column(name = "Password")
        private String Password;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFName() {
                return FName;
        }

        public void setFName(String FName) {
                this.FName = FName;
        }

        public String getLName() {
                return LName;
        }

        public void setLName(String LName) {
                this.LName = LName;
        }

        public String getPName() {
                return PName;
        }

        public void setPName(String PName) {
                this.PName = PName;
        }

        public String getEmail() {
                return Email;
        }

        public void setEmail(String email) {
                Email = email;
        }

        public String getPhone() {
                return Phone;
        }

        public void setPhone(String phone) {
                Phone = phone;
        }

        public String getPassword() {
                return Password;
        }

        public void setPassword(String password) {
                Password = password;
        }

        @Override
        public String toString() {
                return "Client{" +
                        "id=" + id +
                        ", FName='" + FName + '\'' +
                        ", LName='" + LName + '\'' +
                        ", PName='" + PName + '\'' +
                        ", Email='" + Email + '\'' +
                        ", Phone='" + Phone + '\'' +
                        ", Password='" + Password + '\'' +
                        '}';
        }
}
