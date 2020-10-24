package creational.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {

	@Override
	void buildName() {
		website.setName("Enterprise web site");
	}

	@Override
	void buildCms() {
		website.setCms(Cms.ALIFRESCO);
		
	}

	@Override
	void buildPrice() {
		website.setPrice(10000);
	}

}
