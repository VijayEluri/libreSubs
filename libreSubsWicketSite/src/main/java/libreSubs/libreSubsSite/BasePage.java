package libreSubs.libreSubsSite;

import libreSubs.libreSubsSite.download.DownloadFormPage;
import libreSubs.libreSubsSite.editPage.EditSubtitleFormPage;
import libreSubs.libreSubsSite.recentChanges.RecentChangesPage;
import libreSubs.libreSubsSite.upload.UploadFormPage;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public abstract class BasePage extends WebPage {
	
	public BasePage() {
		add(CSSPackageResource.getHeaderContribution(BasePage.class,"style.css")); 
		add(new Image("headerIcon", new ResourceReference(BasePage.class, "headerIcon.png")));
		add(new Image("libreSubsLogo", new ResourceReference(BasePage.class, "libreSubsLogo.png")));
		add(new Image("libreSubsTitle", new ResourceReference(BasePage.class, "libreSubsTitle.png")));
		add(new BookmarkablePageLink<String>("home", HomePage.class));
		add(new BookmarkablePageLink<String>("downloadSub",DownloadFormPage.class));
		add(new BookmarkablePageLink<String>("uploadSub", UploadFormPage.class));
		add(new BookmarkablePageLink<String>("editSub",EditSubtitleFormPage.class));
		add(new BookmarkablePageLink<String>("recentChanges",RecentChangesPage.class));
	}

}
