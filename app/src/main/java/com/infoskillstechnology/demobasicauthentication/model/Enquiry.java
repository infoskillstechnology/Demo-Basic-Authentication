
/*
 * Copyright (c) 2017.  Info Skills Technology Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.infoskillstechnology.demobasicauthentication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Enquiry {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("company_user_id")
    @Expose
    private String companyUserId;
    @SerializedName("enquiry_id")
    @Expose
    private String enquiryId;
    @SerializedName("contact_person_name")
    @Expose
    private String contactPersonName;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("mobile_no")
    @Expose
    private String mobileNo;
    @SerializedName("telephone_no")
    @Expose
    private String telephoneNo;
    @SerializedName("email_id")
    @Expose
    private String emailId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("enquiry_from_where")
    @Expose
    private String enquiryFromWhere;
    @SerializedName("enquiry_get_mobile")
    @Expose
    private String enquiryGetMobile;
    @SerializedName("enquiry_get_email")
    @Expose
    private String enquiryGetEmail;
    @SerializedName("enquiry_get_method")
    @Expose
    private String enquiryGetMethod;
    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("read_status")
    @Expose
    private String readStatus;
    @SerializedName("important_status")
    @Expose
    private String importantStatus;
    @SerializedName("product")
    @Expose
    private String product;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(String companyUserId) {
        this.companyUserId = companyUserId;
    }

    public String getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(String enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEnquiryFromWhere() {
        return enquiryFromWhere;
    }

    public void setEnquiryFromWhere(String enquiryFromWhere) {
        this.enquiryFromWhere = enquiryFromWhere;
    }

    public String getEnquiryGetMobile() {
        return enquiryGetMobile;
    }

    public void setEnquiryGetMobile(String enquiryGetMobile) {
        this.enquiryGetMobile = enquiryGetMobile;
    }

    public String getEnquiryGetEmail() {
        return enquiryGetEmail;
    }

    public void setEnquiryGetEmail(String enquiryGetEmail) {
        this.enquiryGetEmail = enquiryGetEmail;
    }

    public String getEnquiryGetMethod() {
        return enquiryGetMethod;
    }

    public void setEnquiryGetMethod(String enquiryGetMethod) {
        this.enquiryGetMethod = enquiryGetMethod;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus;
    }

    public String getImportantStatus() {
        return importantStatus;
    }

    public void setImportantStatus(String importantStatus) {
        this.importantStatus = importantStatus;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}
