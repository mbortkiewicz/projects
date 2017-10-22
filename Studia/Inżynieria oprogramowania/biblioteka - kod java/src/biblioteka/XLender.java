package biblioteka;

import java.util.Objects;

public class XLender {
	private String name;
	private String surname;
	private String address;
	private byte[] PESEL;

	public XLender() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public byte[] getPESEL() {
		return PESEL;
	}

	public void setPESELNumber(byte number, byte pos) {
		if (pos < 11)
			this.PESEL[pos] = number;
	}

	public void setPESEL(String tab) {
		this.PESEL = new byte[11];

		for (byte i = 0; i < 11; i++)
			setPESELNumber((byte) Character.getNumericValue(tab.charAt(i)), i);

		byte sumctr = CalculateControlSum(this.PESEL);
		if (sumctr != this.PESEL[10])
			System.out.println("Sprawdz czy wprowadzi³eœ poprawny PESEL. Zapisano warunkowo");
		else
			System.out.println("Wprowadzono poprawnie");
	}

	public byte CalculateControlSum(byte[] PESEL) {
		int sumctr;
		sumctr = PESEL[0] + PESEL[4] + PESEL[8] + 3 * (PESEL[1] + PESEL[5] + PESEL[9]) + 7 * (PESEL[2] + PESEL[6])
				+ 9 * (PESEL[3] + PESEL[7]);
		return (byte) (sumctr % 10);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + surname;
	}

	@Override
	public boolean equals(Object object) {
		return PESEL.equals(object);
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + Objects.hash(name, surname, PESEL);
		return hash;
	}
}
