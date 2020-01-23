package comm.example.navi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class MyImage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="image_url")
	private String imageUrl;


		@OneToOne(mappedBy="image", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private Album album;


		public MyImage(String imageUrl) {
			super();
			this.imageUrl = imageUrl;
		}


		public Object getAlbum() {
			// TODO Auto-generated method stub
			return null;
		}

}
