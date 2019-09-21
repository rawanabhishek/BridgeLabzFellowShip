package com.bridgelabz.model;

public class Mh {
	private String firstname;

    private Address address;

    private String contact;

    private String lastname;

    public String getFirstname ()
    {
        return firstname;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String getContact ()
    {
        return contact;
    }

    public void setContact (String contact)
    {
        this.contact = contact;
    }

    public String getLastname ()
    {
        return lastname;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

	@Override
	public String toString() {
		return "Mh [firstname=" + firstname + ", address=" + address + ", contact=" + contact + ", lastname=" + lastname
				+ "]";
	}
    

}
