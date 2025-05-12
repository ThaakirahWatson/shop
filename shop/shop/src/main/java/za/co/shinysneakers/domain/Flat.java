package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;

@Entity
public class Flat extends Address {
    private short unitNumber;
    private String flatName;

    protected Flat() {
        super();
    }

    protected Flat(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
        this.unitNumber = builder.unitNumber;
        this.flatName = builder.flatName;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public String getFlatName() {
        return flatName;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "unitNumber=" + unitNumber +
                ", flatName='" + flatName + '\'' +
                ", addressId=" + addressId +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder {
        private Long addressId;
        private short streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private short postalCode;
        private short unitNumber;
        private String flatName;

        public Builder addressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setUnitNumber(short unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setFlatName(String flatName) {
            this.flatName = flatName;
            return this;
        }

        public Builder copy(Flat flat) {
            this.addressId = flat.addressId;
            this.streetNumber = flat.streetNumber;
            this.streetName = flat.streetName;
            this.suburb = flat.suburb;
            this.city = flat.city;
            this.province = flat.province;
            this.postalCode = flat.postalCode;
            this.unitNumber = flat.unitNumber;
            this.flatName = flat.flatName;
            return this;
        }
        public Flat build() {
            return new Flat(this);
        }
    }
}
