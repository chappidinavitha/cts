import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  public  _image_url='http://rjtmobile.com/grocery/images/';
  public cart=[];
  constructor() { }

  ngOnInit(): void {
    this.cart=JSON.parse(localStorage.cart);
  }

}
