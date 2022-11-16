package com.kodluyoruz.cinemaAutomation.entities;


	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
    import javax.persistence.Table;
   

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table (name = "ORDER_TICKET")
	public class OrderTicket {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "last_name")
	    private String lastName;

	    @Column(name = "row_place")
	    private int rowPlace;

	    @Column(name = "seat")
	    private int seat;

	    @Column(name = "price")
	    private double price;

	    @ManyToOne
	    private Movie movie;

		public OrderTicket(Long id, String name, String lastName, int rowPlace, int seat, double price) {
			this.id = id;
			this.name = name;
			this.lastName = lastName;
			this.rowPlace = rowPlace;
			this.seat = seat;
			this.price = price;
		}
	    
	    

	}


