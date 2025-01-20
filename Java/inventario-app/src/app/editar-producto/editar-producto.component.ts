import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';
import { ActivatedRoute, Router } from '@angular/router';
import { error } from 'console';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-editar-producto',
  imports: [FormsModule],
  templateUrl: './editar-producto.component.html'
})
export class EditarProductoComponent {

  producto:Producto = new Producto();
  id:number;

  constructor(private productoServicio:ProductoService, private ruta:ActivatedRoute,
    private enrutador:Router
  ){}

  ngOnInit(){
    this.id = this.ruta.snapshot.params['id'];
    this.productoServicio.obtenerProdcutoById(this.id).subscribe(
      {
        next:(datos) => this.producto = datos,
        error:(errores:any) => console.log(errores)
      }
    );
  }

  onSubmit(){

    this.actualizaProducto();

  }

  actualizaProducto(){
    this.productoServicio.editarProducto(this.id,this.producto).subscribe(
      {
        next:(datos) => this.irProdcutoLista(),
        error:(errores) => console.log(errores)
      }
    );
  }

  irProdcutoLista(){
    this.enrutador.navigate(['/productos'])
  }

}
