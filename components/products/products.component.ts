import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
public subcategory:any;
public product:any;
public  _image_url='http://rjtmobile.com/grocery/images/';
  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.dataService.getsubcategory(1).subscribe(x=>this.subcategory=x.data)
  
  
    this.dataService.getproduct(1).subscribe(x=>this.product=x.data)
  }

}
