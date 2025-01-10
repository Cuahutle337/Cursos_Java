import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from './producto';


@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private urlBase="http://localhost:8081/inventario-app/productos"

  constructor(private clientHttp: HttpClient) { }

  obtenerProductoLista(): Observable<Producto[]>{
    return this.clientHttp.get<Producto[]>(this.urlBase);
  }
}
