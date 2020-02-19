import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
public subcategory:any;
public product:any;
public catId:any;
public  _image_url='http://rjtmobile.com/grocery/images/';
  constructor(private dataService:DataService,private route:ActivatedRoute) { 
   this.catId=route.snapshot.paramMap.get('id')
  }

  ngOnInit(): void {
    this.dataService.getsubcategory(this.catId).subscribe(x=>this.subcategory=x.data)
  
  
    this.dataService.getproduct(1).subscribe(x=>this.product=x.data)
  }
  onSelectSubCategory(subId)
  {
    console.log(subId);
    this.dataService.getproduct(subId).subscribe(x=>this.product=x.data)
  }
  addtoCart(prod){
    if(localStorage.cart==undefined){
      console.log(prod)
      var cartItems=[];
      cartItems.push(prod);
      localStorage.cart=JSON.stringify(cartItems);
    }
    else{
      var products=JSON.parse(localStorage.cart);
      products.push(prod)
      localStorage.cart=JSON.stringify(products)
    }
  }
}
