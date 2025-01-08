import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-product-list',
  imports: [],
  templateUrl: './product-list.component.html'
})
export class ProductListComponent {

  productos : Producto[];

  constructor(private productService: ProductService){}

  ngOnInit(){
    //Obtenemos los productos
    this.getProducts();
  }

  private getProducts(){
    //Consumir los datos del observable(suscribirnos)
    this.productService.getProducList().subscribe(
      (datos => {
        this.productos = datos;
      })
    )
  }

}
