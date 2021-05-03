package concretes;

import java.util.Calendar;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager extends BaseEntityRepository<Campaign> implements CampaignService {

	@Override
	public void getDetailsOfCampaign(Campaign campaign) {
		System.out.println("Campaign Id: " + campaign.getId());
		System.out.println("Campaign Name: " + campaign.getCampaignName());
		System.out.println("Percentage Of Discount: " + campaign.getPercentageOfDiscount());
		System.out.println("Beginning Date Of Campaign: " + campaign.getBeginningDateOfCampaign().get(Calendar.YEAR) + "/" + campaign.getBeginningDateOfCampaign().get(Calendar.MONTH) + "/" + campaign.getBeginningDateOfCampaign().get(Calendar.DATE) + " (YYYY/MM/DD)");
		System.out.println("Ending Date Of Campaign: " + campaign.getEndingDateOfCampaign().get(Calendar.YEAR) + "/" + campaign.getEndingDateOfCampaign().get(Calendar.MONTH) + "/" + campaign.getEndingDateOfCampaign().get(Calendar.DATE) + " (YYYY/MM/DD)");
	}

}
