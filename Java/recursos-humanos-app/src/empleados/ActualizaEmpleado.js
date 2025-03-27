import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useActionData, useNavigate, useParams } from 'react-router-dom'

export default function ActualizaEmpleado() {

    const urlBase = "http://localhost:8080/rh-app/empleados";

    let Navegacion = useNavigate();

    const {id} = useParams();

  const[empleado,setEmpleado] = useState({

    nombre:"",
    departamento:"",
    sueldo:""

  })

  const{nombre,departamento,sueldo} = empleado

  useEffect(()=>{
    cargarEmpleado();
  },[])

  const cargarEmpleado = async() => {
    const resultado = await axios.get(`${urlBase}/${id}`)
    setEmpleado(resultado.data);
  }

  const onInpuntChange = (e)=>{
    setEmpleado({...empleado,[e.target.name]:e.target.value})
  }

  const onSummit = async (e) =>{
    e.preventDefault();
    
    await axios.put(`${urlBase}/${id}`,empleado);
    //redirigimos a la pagina de inicio
    Navegacion('/');

  }


  return (

    <div className='container'>
        <div className='container text-center' style={{margin: "30px" }}>
          <h3>Actualizar Empleado</h3>
        </div>

        <form onSubmit={(e) => onSummit(e)}>
              <div className="mb-3">
                <label htmlForm="nombre" className="form-label">Nombre</label>
                <input type="text" className="form-control" id="nombre" 
                name='nombre' required={true}
                value={nombre} onChange={(e)=> onInpuntChange(e)}/>
              </div>
              <div className="mb-3">
                <label htmlForm="departamento" className="form-label">Departamento</label>
                <input type="text" className="form-control" id="departamento" name='departamento'
                value={departamento} onChange={(e)=> onInpuntChange(e)}/>
              </div>
              <div className="mb-3">
                <label htmlForm="sueldo" className="form-label">Sueldo</label>
                <input type="number" step="any" className="form-control" id="sueldo" name='sueldo'
                value={sueldo} onChange={(e)=> onInpuntChange(e)}/>
              </div>
              
              <div className='text-center'>

              <button type="submit" className="btn btn-warning btn-sm me-3">Guardar</button>
              <a href='/' className='btn btn-danger btn-sm '>Regresar</a>

              </div>

              
          </form>


    </div>

  )
}
