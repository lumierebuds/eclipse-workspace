package com.kh.chap01_innerClass.part02_static.mode.vo;

import java.util.Date;

/*
 * VO(Value Object) 
 * 	- 애플리케이션을 이루는데 있어서 핵심적인 역할을 하는 클래스를 정의하는 패키지.
 *  - 객체지향적인 클래스로 설계하며 내부적으로 캡슐화 및 상속이 구현되어있음. 필요에 따라 equals, hashCode 등의 함수를 재정의 
 *    할수도 있고, 클래스만의 고유한 메서드가 존재할 수 있다. 
 * 
 * DTO(Data Transfer Object) 
 *  - API 서버간에 데이터 송수신하기 위한 용도의 객체를 정의하는 클래스.
 *  - 어플리케이션의 비즈니스로직에서 사용되는 VO클래스들과는 다르게 데이터 송수신 목적으로만 사용하기때문에
 *    불필요한 메서드가 존재하지 않는다. 오직 데이터 저장 및 조회 기능의 메서드만 정의해둠. 
 *  - API 서버에서 제공하는 응답데이터를 DTO 클래스로 정의하고 사용함.
 *  - 거대 API 서버 같은 경우(구글, 카카오, 네이버) 굉장히 많은 기능들(서비스 및 데이터)을 제공하고 있고 기능별로 필요로 하는 
 *    요청주소 및 요청변수가 다르고 응답데이터 또한 다양하다. 이 응답 데이터들을 모두 DTO 클래스로 정의하게 되면 너무 많은 클래스가 나옴.
 *  - 너무많은 클래스가 있다면 유지보수나 관리가 힘드므로 보통 정적 내부 클래스를 이용하여 하나의 클래스 파일로 묶어서 관리한다.  
 *	 
 */

public class KakaoUserInfoResponse {

	private Long id;
	private Boolean has_signed_up;
	private Date connected_at;
	private Date synched_at;

	public static class KakaoProperties {
		private String nickName;
		private String profile_image;
		private String thumbnail_image;

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getProfile_image() {
			return profile_image;
		}

		public void setProfile_image(String profile_image) {
			this.profile_image = profile_image;
		}

		public String getThumbnail_image() {
			return thumbnail_image;
		}

		public void setThumbnail_image(String thumbnail_image) {
			this.thumbnail_image = thumbnail_image;
		}

	}

	public static class KakaoAccount {
		private Boolean profile_needs_agreement;
		private Boolean profile_nickname_needs_agreement;
		private String email;

		public Boolean getProfile_needs_agreement() {
			return profile_needs_agreement;
		}

		public void setProfile_needs_agreement(Boolean profile_needs_agreement) {
			this.profile_needs_agreement = profile_needs_agreement;
		}

		public Boolean getProfile_nickname_needs_agreement() {
			return profile_nickname_needs_agreement;
		}

		public void setProfile_nickname_needs_agreement(Boolean profile_nickname_needs_agreement) {
			this.profile_nickname_needs_agreement = profile_nickname_needs_agreement;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}

	private KakaoProperties properties;
	private KakaoAccount kakao_account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getHas_signed_up() {
		return has_signed_up;
	}

	public void setHas_signed_up(Boolean has_signed_up) {
		this.has_signed_up = has_signed_up;
	}

	public Date getConnected_at() {
		return connected_at;
	}

	public void setConnected_at(Date connected_at) {
		this.connected_at = connected_at;
	}

	public Date getSynched_at() {
		return synched_at;
	}

	public void setSynched_at(Date synched_at) {
		this.synched_at = synched_at;
	}

	public KakaoProperties getProperties() {
		return properties;
	}

	public void setProperties(KakaoProperties properties) {
		this.properties = properties;
	}

	public KakaoAccount getKakao_account() {
		return kakao_account;
	}

	public void setKakao_account(KakaoAccount kakao_account) {
		this.kakao_account = kakao_account;
	}

}
