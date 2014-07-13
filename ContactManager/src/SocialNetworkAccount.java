
public class SocialNetworkAccount {
	public SocialNetworkAccountType socialNetworkAccountType;
	public String id;
	public SocialNetworkAccount(SocialNetworkAccountType socialNetworkAccountType, String id) {
		this.socialNetworkAccountType = socialNetworkAccountType;
		this.id = id;
	}
	public boolean equals(SocialNetworkAccount socialAccount){
		return ((this.socialNetworkAccountType.equals(socialAccount.socialNetworkAccountType))
				&&(this.id == socialAccount.id));
		
	}
	
	
}
