/*
 * @ 작성일 : 2020.03.11
 */
package data;

public class Coupon {
	private String name;

	private int discount;

	Data data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Coupon(Data data) {
		this.data = data;

	}

	public Coupon(String name, int nowDiscount) {
		this.name = name;
		this.discount = nowDiscount;

	}

}