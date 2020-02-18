import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
 private base_url="http://apolis-grocery.herokuapp.com/api/";
 private catageory_url="category";
 private _subCategoryUrl="subcategory/"
private _productUrl="products/"
  constructor(private http:HttpClient) { }
  getCategories():Observable<any>{

    return this.http.get<any>(`${this.base_url+this.catageory_url}`)
  }
  getsubcategory(catId):Observable<any>{
    return this.http.get<any>(`${this.base_url+this._subCategoryUrl+catId}`)
  }
  getproduct(catId):Observable<any>{
    return this.http.get<any>(`${this.base_url+this._productUrl+catId}`)
  }
}
