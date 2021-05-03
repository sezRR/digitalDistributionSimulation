package entities;

import java.util.Calendar;

import abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private Calendar beginningDateOfCampaign;
	private Calendar endingDateOfCampaign;
	private int percentageOfDiscount;

	public Campaign(int id, String campaignName, Calendar beginningDateOfCampaign, Calendar endingDateOfCampaign, int percentageOfDiscount) {
		this.id = id;
		this.campaignName = campaignName;
		this.beginningDateOfCampaign = beginningDateOfCampaign;
		this.endingDateOfCampaign = endingDateOfCampaign;
		this.percentageOfDiscount = percentageOfDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Calendar getBeginningDateOfCampaign() {
		return beginningDateOfCampaign;
	}

	public void setBeginningDateOfCampaign(Calendar beginningDateOfCampaign) {
		this.beginningDateOfCampaign = beginningDateOfCampaign;
	}

	public Calendar getEndingDateOfCampaign() {
		return endingDateOfCampaign;
	}

	public void setEndingDateOfCampaign(Calendar endingDateOfCampaign) {
		this.endingDateOfCampaign = endingDateOfCampaign;
	}

	public int getPercentageOfDiscount() {
		return percentageOfDiscount;
	}

	public void setPercentageOfDiscount(int percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}
}
