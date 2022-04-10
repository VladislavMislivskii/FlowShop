import React from 'react'
import '../styles/btn_primary.css'

const Btn_primary_disabled = (props) => {
  return (
    <button class="btn-primary" href='#' disabled>{props.value}</button>
  )
}

export default Btn_primary_disabled