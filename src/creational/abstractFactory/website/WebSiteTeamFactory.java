package creational.abstractFactory.website;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory{

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebSitePM();
	}

}
