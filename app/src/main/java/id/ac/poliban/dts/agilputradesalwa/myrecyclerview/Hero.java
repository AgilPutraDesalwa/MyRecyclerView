package id.ac.poliban.dts.agilputradesalwa.myrecyclerview;

import java.io.Serializable;

public class Hero implements Serializable {
        private String name;
        private String detail;
        private int photo;

        public Hero(String name, String detail, int photo) {
            this.name = name;
            this.detail = detail;
            this.photo = photo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public int getPhoto() {
            return photo;
        }

        public void setPhoto(int photo) {
            this.photo = photo;
        }

        @Override
        public String toString() {
            return String.format("%-20", getName());
        }
    }